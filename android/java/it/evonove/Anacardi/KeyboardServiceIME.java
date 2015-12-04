package it.evonove.Anacardi;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.View;
import android.widget.Toast;

public class KeyboardServiceIME extends InputMethodService implements KeyboardView.OnKeyboardActionListener {

    private Keyboard mKeyBoard;
    private KeyboardView mKeyView;

    private boolean caps = false;

    @Override
    public View onCreateInputView() {
        mKeyView = (KeyboardView) getLayoutInflater().inflate(R.layout.keyboard, null);
        mKeyBoard = new Keyboard(this, R.xml.qwerty);
        mKeyView.setKeyboard(mKeyBoard);
        mKeyView.setOnKeyboardActionListener(this);
        return mKeyView;
    }

    // Listeners
    @Override
    public void onPress(int primaryCode) {
        // no-op
    }

    @Override
    public void onRelease(int primaryCode) {
        // no-op
    }

    @Override
    public void onKey(int primaryCode, int[] keyCodes) {
        Toast.makeText(this, String.format("onKey, primaryCode: %s", primaryCode), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onText(CharSequence text) {

    }

    @Override
    public void swipeLeft() {
        // no-op
    }

    @Override
    public void swipeRight() {
        // no-op
    }

    @Override
    public void swipeDown() {
        // no-op
    }

    @Override
    public void swipeUp() {
        // no-op
    }
}
