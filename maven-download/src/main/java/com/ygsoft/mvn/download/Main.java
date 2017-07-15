package com.ygsoft.mvn.download;

import java.io.File;
import java.io.IOException;

import org.eclipse.aether.resolution.ArtifactResolutionException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
	public static void main(Params params, String outputPath) throws IOException {
		try {
			DownloadMavenJar.DownLoad(params);// 下载jar包
		} catch (ArtifactResolutionException e) {
			System.out.println("下载失败！");
			e.printStackTrace();
		}
	}

	@Override
	public void run(String... args) throws Exception {
		Params params = new Params();
		for (String arg : args) {
			String[] items = arg.split("=");
			if (items[0].equals("-group")) {
				params.setGroupId(items[1]);
			} else if (items[0].equals("-artifact")) {
				params.setArtifactId(items[1]);
			} else if (items[0].equals("-version")) {
				params.setVersion(items[1]);
			} else if (items[0].equals("-repository")) {
				params.setRepository(items[1]);
			}
		}
		if (!isNotEmpty(params.getRepository())) {
			if (params.getArtifactId().endsWith("SNAPSHOT")) {
				params.setRepository("http://maven.ygsoft.com/nexus/content/repositories/snapshots/");
			} else {
				params.setRepository("http://maven.ygsoft.com/nexus/content/repositories/public");
			}
		}
		params.setTarget(System.getProperty("java.io.tmpdir"));
		checkParams(params);
		DownloadMavenJar.DownLoad(params);
		String jarFile = params.getTarget() + "/" + params.getGroupId().replace(".", "/") + "/" + params.getArtifactId()
				+ "/" + params.getVersion() + "/" + params.getArtifactId() + "-" + params.getVersion() + ".jar";
		System.out.println("下载文件，" + jarFile);

		String destFile = System.getProperty("user.dir") + "/app.jar";
		File file = new File(jarFile);
		if (file.renameTo(new File(destFile))) {
			System.out.println("移动文件到" + destFile);
		} else {
			System.err.println("移动文件失败，" + destFile);
		}
	}

	private void checkParams(Params params) {
		if (isNotEmpty(params.getGroupId()) && isNotEmpty(params.getArtifactId()) && isNotEmpty(params.getVersion())
				&& isNotEmpty(params.getRepository())) {
		} else {
			System.err.println("参数不合法： -group=xwh -artifact=devops.petstore -version=1.0-SNAPSHOT");
		}
	}

	private boolean isNotEmpty(String value) {
		return (value != null) && (value.length() > 0);
	}

	public static void main(String[] args) throws Exception {
		new SpringApplication(Main.class).run(args);
	}
}
