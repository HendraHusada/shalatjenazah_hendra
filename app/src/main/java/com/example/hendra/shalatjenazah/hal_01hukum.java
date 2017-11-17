package com.example.hendra.shalatjenazah;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class hal_01hukum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_01hukum);

        WebView view = (WebView) findViewById(R.id.textcontent);
        view.setBackgroundColor(0);
        view.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        String text;
        text = "<html><body><p align=\"justify\" style=\"font-size:16pt; font-style:normal; font-family:serif-monospace\">";
        text+= "Shalat jenazah adalah shalat yang dilakukan kaum muslim terhadap muslim lainnya yang meninggal dunia. Hukum untuk melaksanakan shalat jenazah adalah <b><i><u>fardhu kifayah</u></i></b> (wajib bagi sebagian kaum muslim). Artinya harus ada sebagian kaum muslim yang melaksanakan shalat jenazah apabila ada seorang muslim meninggal dunia. Bila hal itu terpenuhi maka gugurlah kewajiban muslim lain untuk menshalatkannya. Namun apabila tidak ada satupun muslim yang melaksanakan shalat jenazah maka seluruh orang orang muslim akan mendapat dosa karena meninggalkan sesuatu yang fardhu";
        text+= "</p></body></html>";
        view.loadData(text, "text/html", "utf-8");
    }
}
