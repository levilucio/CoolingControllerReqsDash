package org.iets3.req.plugin.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.GeneratedActionGroup;
import com.intellij.openapi.actionSystem.Separator;

public class Group_requirementsAsTables_ActionGroup extends GeneratedActionGroup {
  public static final String ID = "org.iets3.req.plugin.plugin.Group_requirementsAsTables_ActionGroup";
  public Group_requirementsAsTables_ActionGroup() {
    super("Group_requirementsAsTables", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    Group_requirementsAsTables_ActionGroup.this.add(new TogglerequirementsAsTables());
    Group_requirementsAsTables_ActionGroup.this.add(Separator.getInstance());
  }
}
