/*
 * Copyright (C) 2006 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mobsandgeeks.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/**
 * <p>
 * A radio button is a two-states button that can be either checked or
 * unchecked. When the radio button is unchecked, the user can press or click it
 * to check it. However, contrary to a {@link android.widget.CheckBox}, a radio
 * button cannot be unchecked by the user once checked.
 * </p>
 *
 * <p>
 * Radio buttons are normally used together in a
 * {@link com.mobsandgeeks.ui.RadioGroup}. When several radio buttons live inside
 * a radio group, checking one radio button unchecks all the others.</p>
 * </p>
 *
 * <p><strong>XML attributes</strong></p>
 * <p> 
 * See {@link android.R.styleable#CompoundButton CompoundButton Attributes}, 
 * {@link android.R.styleable#Button Button Attributes}, 
 * {@link android.R.styleable#TextView TextView Attributes}, 
 * {@link android.R.styleable#View View Attributes}
 * </p>
 */
public class UncheckableRadioButton extends CompoundButton {
    
    public UncheckableRadioButton(Context context) {
        this(context, null);
    }
    
    public UncheckableRadioButton(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.radioButtonStyle);
    }

    public UncheckableRadioButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    /**
     * {@inheritDoc}
     * <p>
     * This method will toggle the radio button.
     */
    @Override
    public void toggle() {
        super.toggle();
    }
}
