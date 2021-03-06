package org.iets3.req.plugin.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.annotations.NotNull;

public class DeleteRequirement_Action extends BaseAction {
  private static final Icon ICON = IconContainer.ICON_a0_0;

  public DeleteRequirement_Action() {
    super("Delete", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }
  @Override
  public boolean isDumbAware() {
    return true;
  }
  @Override
  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      SNode node = event.getData(MPSCommonDataKeys.NODE);
      if (node != null && !(SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc8195aeL, "org.iets3.req.core.structure.AbstractRequirement")))) {
        node = null;
      }
      if (node == null) {
        return false;
      }
    }
    return true;
  }
  @Override
  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    SNodeOperations.deleteNode(event.getData(MPSCommonDataKeys.NODE));
  }
}
