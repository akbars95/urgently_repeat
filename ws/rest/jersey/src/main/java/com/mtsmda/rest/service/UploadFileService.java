package com.mtsmda.rest.service;

/*import com.sun.jersey.core.header.FormDataContentDisposition;*/
/*import com.sun.jersey.multipart.FormDataParam;*/

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by MTSMDA on 26.12.2015.
 */
@Path("/file")
public class UploadFileService {

    /*@POST
    @Path("/upload")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response uploadFile(@FormDataParam("fileUp") InputStream uploadInputStream, @FormDataParam("fileUp") FormDataContentDisposition uploadFormDataContentDisposition) {
        String fileLocation = uploadFormDataContentDisposition.getFileName();
        System.out.println(fileLocation);
        writeToFile(uploadInputStream, fileLocation);
        return Response.status(200).entity("Your file - " + fileLocation + " success uploaded").build();
    }*/

    private void writeToFile(InputStream inputStream, String fileLocation) {
        try (OutputStream outputStream = new FileOutputStream(new File(fileLocation));) {
            int read = 0;
            byte[] bytes = new byte[1024];

            while ((read = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }
            outputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}