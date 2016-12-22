package com.alo7.android.androidpdf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alo7.android.pdfreader.PdfView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PdfView pdfView = (PdfView) findViewById(R.id.pdf_view);
        pdfView.loadFromFile(new File("/storage/emulated/0/Download/testpdf.pdf"));
    }
}
