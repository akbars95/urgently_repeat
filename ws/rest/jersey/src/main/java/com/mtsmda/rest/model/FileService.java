package com.mtsmda.rest.model;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.File;

/**
 * Created by MTSMDA on 25.12.2015.
 */
@Path("/file")
public class FileService {

    @GET
    @Path("/getFileTxt")
    @Produces("text/plain")
    public Response getFileTXT() {
        File file = new File("T:\\development\\real\\urgently_repeat\\ws\\rest\\jersey\\file.txt");
        System.out.println(file.getAbsoluteFile());
        Response.ResponseBuilder responseBuilder = Response.ok(file);
        responseBuilder.header("Content-Disposition", "attachment; filename=\"file from server.txt\"");
        return responseBuilder.build();
    }


    @GET
    @Path("/getFileImage")
    @Produces("image/png")
    public Response getFileImage() {
        File file = new File("T:\\development\\real\\urgently_repeat\\ws\\rest\\jersey\\java.png");

        Response.ResponseBuilder responseBuilder = Response.ok(file);
        responseBuilder.header("Content-Disposition", "attachment; filename=\"file from server Image.png\"");
        return responseBuilder.build();
    }

    @GET
    @Path("/getFilePDF")
    @Produces("application/pdf")
    public Response getFilePDF() {
        File file = new File("T:\\development\\real\\urgently_repeat\\ws\\rest\\jersey\\P. Nagesh Rao - Spring Batch Essentials - 2015.pdf");

        Response.ResponseBuilder responseBuilder = Response.ok(file);
        responseBuilder.header("Content-Disposition", "attachment; filename=\"file from server PDF.pdf\"");
        return responseBuilder.build();
    }

    @GET
    @Path("/getFileExcel")
    @Produces("application/vnd.ms-excel")
    public Response getFileExcel() {
        File file = new File("T:\\development\\real\\urgently_repeat\\ws\\rest\\jersey\\excel.xls");

        Response.ResponseBuilder responseBuilder = Response.ok(file);
        responseBuilder.header("Content-Disposition", "attachment; filename=\"file from server excel.xls\"");
        return responseBuilder.build();
    }

}