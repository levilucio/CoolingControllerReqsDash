package org.iets3.flow.dashboard.editor;

/*Generated by MPS */

import de.itemis.mps.editor.diagram.runtime.shape.AbstractShape;
import org.jetbrains.annotations.Nullable;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import de.itemis.mps.editor.diagram.runtime.shape.IShapeStyle;
import java.awt.Color;
import java.awt.BasicStroke;

public class BoxVisulisation extends AbstractShape {

  private int status;
  private boolean isStart;
  private boolean isFinal;

  public BoxVisulisation(int status, boolean isStart, boolean isFinal) {
    this.status = status;
    this.isStart = isStart;
    this.isFinal = isFinal;
  }

  @Nullable
  @Override
  public Double getDefaultSize() {
    return ((double) (15));
  }



  @Override
  protected void draw(final Graphics2D graphics, final Rectangle2D bounds, IShapeStyle style) {
    // Visited states 
    if (this.status == 0) {
      graphics.setColor(Color.GREEN);
      graphics.draw(bounds);
    }
    // Current State 
    if (this.status == 1) {
      graphics.setColor(Color.blue);
      graphics.setStroke(new BasicStroke(5.0f));
      graphics.draw(bounds);
    }
    // ToCome State 
    if (this.status == 2) {
      graphics.setColor(Color.white);
      graphics.setStroke(new BasicStroke(5.0f));

      graphics.draw(bounds);
    }
    // DontCare State 
    if (this.status == 3) {
      graphics.setColor(Color.DARK_GRAY);
      graphics.setStroke(new BasicStroke(5.0f));
      graphics.draw(bounds);
    }
    // Start state with thick black stroke 
    if (this.isStart == true) {
      graphics.setColor(Color.black);
      graphics.setStroke(new BasicStroke(5.0f));
      graphics.draw(bounds);

    }
    // Final state with thick black stroke 

    if (this.isFinal == true) {
      graphics.setColor(Color.black);
      graphics.setStroke(new BasicStroke(5.0f));
      graphics.draw(bounds);

    }
  }

}
