package com.example.hfs.alipayuidemo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * ScrollView中嵌套ListView，重写ListView计算高度
 */
public class ScrollviewListView extends ListView {
    public ScrollviewListView(Context context) {
        super(context);
    }

    public ScrollviewListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ScrollviewListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,

                MeasureSpec.AT_MOST);

        super.onMeasure(widthMeasureSpec, expandSpec);

    }
}
