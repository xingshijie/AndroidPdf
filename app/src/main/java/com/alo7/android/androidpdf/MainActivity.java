package com.alo7.android.androidpdf;

import com.alo7.android.pdfreader.PdfView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PdfView pdfView = (PdfView)findViewById(R.id.pdf_view);
//         pdfView.loadFromFile(new File("/storage/emulated/0/Download/testpdf.pdf"));
        pdfView.loadFromUrl(
                "https://s3.cn-north-1.amazonaws.com.cn/im-ugc.saybot.net/ddd8/ddd89800-b865-0134-0a5d-068ea3e0d55bddd89b10-b865-0134-0a5d-068ea3e0d55b/Write_Clean_Code(中文版).pdf");
    }


}
