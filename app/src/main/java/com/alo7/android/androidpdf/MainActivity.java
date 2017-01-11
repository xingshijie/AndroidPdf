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
//        pdfView.loadFromUrl(
//                "https://s3.cn-north-1.amazonaws.com.cn/im-ugc.saybot.net/f761/f7611b30-b84e-0134-0e3b-2c87a3164e97f7611c50-b84e-0134-0e3b-2c87a3164e97/100RPG.txt");
//        pdfView.loadText("https://s3.cn-north-1.amazonaws.com.cn/im-ugc.saybot.net/2e64/2e644330-b617-0134-0a5d-068ea3e0d55b2e644620-b617-0134-0a5d-068ea3e0d55b/新建文本文档.txt");
        pdfView.loadText("https://s3.cn-north-1.amazonaws.com.cn/im-ugc.saybot.net/051a/051af8f0-b944-0134-0c7d-068ea3e0d55b051afdc0-b944-0134-0c7d-068ea3e0d55b/新建文本文档.txt");
    }


}
