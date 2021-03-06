package com.meli.android.carddrawer.configuration;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import android.text.TextPaint;

public interface CardFontConfiguration {

    /**
     * @return the color to use for empty text
     */
    @ColorInt
    int getColor();

    /**
     * Sets the shadow for configuration
     * @param textPaint textPaint for the shadow
     */
    void setShadow(@NonNull TextPaint textPaint);
}