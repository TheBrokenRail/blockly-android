package com.google.blockly.android.ui.fieldview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

class FieldAdapter<T> extends ArrayAdapter<T> {
    private AppCompatSpinner mSpinner;

    public FieldAdapter(@NonNull Context context, int resource, @NonNull List<T> objects, AppCompatSpinner mSpinner) {
        super(context, resource, objects);
        this.mSpinner = mSpinner;
    }

    public FieldAdapter(@NonNull Context context, int resource, AppCompatSpinner mSpinner) {
        super(context, resource);

        this.mSpinner = mSpinner;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(mSpinner.getSelectedItemPosition(), convertView, parent);
    }
}