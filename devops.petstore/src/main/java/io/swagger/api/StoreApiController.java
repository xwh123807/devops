package io.swagger.api;

import io.swagger.model.Body2;
import io.swagger.model.InlineResponse2003;
import java.util.Map;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-30T06:26:34.006Z")

@Controller
public class StoreApiController implements StoreApi {



    public ResponseEntity<Void> deleteOrder( @Min(1)@ApiParam(value = "ID of the order that needs to be deleted",required=true ) @PathVariable("orderId") Long orderId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Map<String, Integer>> getInventory() {
        // do some magic!
        return new ResponseEntity<Map<String, Integer>>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2003> getOrderById( @Min(1) @Max(10)@ApiParam(value = "ID of pet that needs to be fetched",required=true ) @PathVariable("orderId") Long orderId) {
        // do some magic!
        return new ResponseEntity<InlineResponse2003>(HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse2003> placeOrder(@ApiParam(value = "order placed for purchasing the pet" ,required=true ) @RequestBody Body2 body) {
        // do some magic!
        return new ResponseEntity<InlineResponse2003>(HttpStatus.OK);
    }

}
