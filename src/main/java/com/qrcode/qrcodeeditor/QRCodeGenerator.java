package com.qrcode.qrcodeeditor;
// QRCodeGenerator.java
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import net.glxn.qrgen.javase.QRCode;
import net.glxn.qrgen.core.image.ImageType;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
@Service
public class QRCodeGenerator {
    public static String generateQRCode(String text) {
        ByteArrayOutputStream stream = QRCode.from(text).to(ImageType.PNG).stream();
        byte[] qrCodeBytes = stream.toByteArray();
        return Base64.getEncoder().encodeToString(qrCodeBytes);
    }




}

