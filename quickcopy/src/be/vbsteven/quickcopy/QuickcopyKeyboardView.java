package be.vbsteven.quickcopy;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class QuickcopyKeyboardView extends FrameLayout {

	private Context context;
	
	public QuickcopyKeyboardView(Context context) {
		super(context);
		this.context = context;
		init();
	}
	
	public QuickcopyKeyboardView(Context context, AttributeSet attrset) {
		super(context, attrset);
		init();
	}
	
	
	private void init() {
	}
	
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		super.setMeasuredDimension(400, 275);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
	}
	
	


}