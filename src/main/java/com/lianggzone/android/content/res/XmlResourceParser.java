package com.lianggzone.android.content.res;

import com.lianggzone.android.util.AttributeSet;
import com.lianggzone.org.xmlpull.v1.XmlPullParser;

public interface XmlResourceParser extends XmlPullParser, AttributeSet {
	void close();
}
