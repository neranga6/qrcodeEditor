//package com.qrcode.qrcodeeditor;
//
//import com.google.api.client.auth.oauth2.Credential;
//        import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
//        import com.google.api.client.googleapis.json.GoogleJsonResponseException;
//        import com.google.api.client.http.FileContent;
//        import com.google.api.client.http.HttpTransport;
//        import com.google.api.client.http.InputStreamContent;
//        import com.google.api.client.json.JsonFactory;
//        import com.google.api.client.json.jackson2.JacksonFactory;
//        import com.google.api.services.drive.Drive;
//        import com.google.api.services.drive.DriveScopes;
//        import com.google.api.services.drive.model.File;
//        import com.google.api.services.drive.model.ParentReference;
//
//        import java.io.IOException;
//        import java.io.InputStream;
//        import java.security.GeneralSecurityException;
//        import java.util.Collections;
//        import java.util.List;
//
//public class GoogleDriveService {
//    private static final String APPLICATION_NAME = "Your Application Name";
//    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
//    private static final List<String> SCOPES = Collections.singletonList(DriveScopes.DRIVE_FILE);
//    private static final String PARENT_FOLDER_ID = "your_parent_folder_id"; // Replace with your desired parent folder ID
//
//    private final Drive drive;
//
//    public GoogleDriveService() throws GeneralSecurityException, IOException {
//        HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
//        Credential credential = getCredentials(httpTransport);
//        drive = new Drive.Builder(httpTransport, JSON_FACTORY, credential)
//                .setApplicationName(APPLICATION_NAME)
//                .build();
//    }
//
//    private Credential getCredentials(HttpTransport httpTransport) throws IOException {
//        // Logic to obtain Google Drive API credentials
//        return null; // Replace with your credentials retrieval logic
//    }
//
//    public String uploadRecording(InputStream inputStream, String fileName) throws IOException {
//        File fileMetadata = new File();
//        fileMetadata.setName(fileName);
//        fileMetadata.setParents(Collections.singletonList(new ParentReference().setId(PARENT_FOLDER_ID)));
//
//        InputStreamContent mediaContent = new InputStreamContent(null, inputStream);
//
//        File uploadedFile = drive.files().create(fileMetadata, mediaContent)
//                .setFields("id")
//                .execute();
//
//        return uploadedFile.getId();
//    }
//}

