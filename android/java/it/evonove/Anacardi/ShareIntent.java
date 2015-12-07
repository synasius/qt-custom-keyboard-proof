package it.evonove.Anacardi;

import android.content.*;
import android.text.*;
import org.qtproject.qt5.android.bindings.QtActivity;

public class ShareIntent {
    static public void shareText(String title, String subject,
                                 String content, QtActivity activity)
    {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        share.putExtra(Intent.EXTRA_SUBJECT, subject);
        share.putExtra(Intent.EXTRA_TEXT, Html.fromHtml(content).toString());
        share.putExtra(Intent.EXTRA_HTML_TEXT, content);
        activity.startActivity(Intent.createChooser(share, title));
    }

    static public void shareAudioClip()
    {
    }

    static public void shareVideoClip()
    {
    }
}

