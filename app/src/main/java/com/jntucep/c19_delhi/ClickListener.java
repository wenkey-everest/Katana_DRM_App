package com.jntucep.c19_delhi;

import android.view.View;

/**
 * Created by VMac on 06/01/17.
 */

public interface ClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}