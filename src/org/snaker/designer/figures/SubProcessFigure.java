/* Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.snaker.designer.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.graphics.Color;
import org.snaker.designer.model.SubProcess;

/**
 * 子流程图形
 * 
 * @author yuqs
 * @version 1.0
 */
public class SubProcessFigure extends RoundedRectangleElementFigure {
	private static final Color veryLightBlue_sub = new Color(null, 240, 80, 50);
	private static final Color lightBlue_sub = new Color(null, 3, 104, 154);

	public SubProcessFigure(SubProcess subProcess) {
		setText(subProcess.getDisplayName());
	}

	protected void paintChildren(Graphics graphics) {
		Color foregroundColor = graphics.getForegroundColor();
		Color backgroundColor = graphics.getBackgroundColor();
		graphics.setBackgroundColor(veryLightBlue_sub);
		graphics.setForegroundColor(lightBlue_sub);

		super.paintChildren(graphics);
		graphics.setBackgroundColor(backgroundColor);
		graphics.setForegroundColor(foregroundColor);
	}

	protected void customizeFigure() {
		super.customizeFigure();
		getLabel().setForegroundColor(ColorConstants.darkGray);
		rectangle.setLineWidth(2);
	}
}
