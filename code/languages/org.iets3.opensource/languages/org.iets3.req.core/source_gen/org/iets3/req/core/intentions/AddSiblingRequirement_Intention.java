package org.iets3.req.core.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.IntentionDescriptorBase;
import jetbrains.mps.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.intentions.IntentionExecutable;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.intentions.IntentionType;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Collections;
import jetbrains.mps.intentions.IntentionExecutableBase;
import org.iets3.req.core.behavior.AbstractRequirement__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.editor.runtime.selection.SelectionUtil;
import jetbrains.mps.openapi.editor.selection.SelectionManager;
import jetbrains.mps.intentions.IntentionDescriptor;

public final class AddSiblingRequirement_Intention extends IntentionDescriptorBase implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public AddSiblingRequirement_Intention() {
    super(MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc8195aeL, "org.iets3.req.core.structure.AbstractRequirement"), IntentionType.NORMAL, true, new SNodePointer("r:533ea973-5538-450e-b933-d6335409cb90(org.iets3.req.core.intentions)", "8812464827223052762"));
  }
  @Override
  public String getPresentation() {
    return "AddSiblingRequirement";
  }
  @Override
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(isApplicableToNode(node, editorContext))) {
      return false;
    }
    if (editorContext.getSelectedNode() != node && !(isVisibleInChild(node, editorContext.getSelectedNode(), editorContext))) {
      return false;
    }
    return true;
  }
  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return SNodeOperations.isInstanceOf(node, MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc8195b9L, "org.iets3.req.core.structure.DefaultRequirement"));
  }
  private boolean isVisibleInChild(final SNode node, final SNode childNode, final EditorContext editorContext) {
    return ListSequence.fromList(SNodeOperations.getNodeAncestors(childNode, MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc8195aeL, "org.iets3.req.core.structure.AbstractRequirement"), false)).count() == 1;
  }
  @Override
  public boolean isSurroundWith() {
    return false;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new AddSiblingRequirement_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends IntentionExecutableBase {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Add Sibling " + AbstractRequirement__BehaviorDescriptor.getDisplayName_id7gL8KYmPHWW.invoke(node);
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      SNode req = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc8195b9L, "org.iets3.req.core.structure.DefaultRequirement"));
      SPropertyOperations.set(req, MetaAdapterFactory.getProperty(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc8195aeL, 0xb54392f5f8273cdL, "uniqueID"), "" + ((int) AbstractRequirement__BehaviorDescriptor.nextReqID_id67kIGnNsPVW.invoke(SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc8195b9L, "org.iets3.req.core.structure.DefaultRequirement")), node)));

      SNode requiredDoc = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc883be3L, "org.iets3.req.core.structure.RequirementsDocSection"));
      SLinkOperations.setTarget(req, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc8195b9L, 0x477d8ab2bc883be0L, "doc"), requiredDoc);

      SNodeOperations.insertNextSiblingChild(node, ListSequence.fromList(SNodeOperations.getNodeDescendants(SNodeOperations.getContainingRoot(node), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc8195b9L, "org.iets3.req.core.structure.DefaultRequirement"), false, new SAbstractConcept[]{})).addElement(req));

      SelectionUtil.selectCell(editorContext, req, SelectionManager.FIRST_EDITABLE_CELL);

    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return AddSiblingRequirement_Intention.this;
    }
  }
}
