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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.Collections;
import jetbrains.mps.intentions.IntentionExecutableBase;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public final class SplitSentenceIntoWords_Intention extends IntentionDescriptorBase implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public SplitSentenceIntoWords_Intention() {
    super(MetaAdapterFactory.getConcept(0x92d2ea165a424fdfL, 0xa676c7604efe3504L, 0x237c8da86a9f2e0cL, "de.slisson.mps.richtext.structure.Word"), IntentionType.NORMAL, false, new SNodePointer("r:533ea973-5538-450e-b933-d6335409cb90(org.iets3.req.core.intentions)", "8913201067422840907"));
  }
  @Override
  public String getPresentation() {
    return "SplitSentenceIntoWords";
  }
  @Override
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }
  private boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getContainingRoot(node), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc81949cL, "org.iets3.req.core.structure.RequirementsChunk")) && SPropertyOperations.getString(node, MetaAdapterFactory.getProperty(0x92d2ea165a424fdfL, 0xa676c7604efe3504L, 0x237c8da86a9f2e0cL, 0x237c8da86a9f2e0eL, "escapedValue")).contains(" ");
  }
  @Override
  public boolean isSurroundWith() {
    return false;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new SplitSentenceIntoWords_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends IntentionExecutableBase {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Split Sentence into Words";
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      String[] words = SPropertyOperations.getString(node, MetaAdapterFactory.getProperty(0x92d2ea165a424fdfL, 0xa676c7604efe3504L, 0x237c8da86a9f2e0cL, 0x237c8da86a9f2e0eL, "escapedValue")).split(" ");

      for (String word : words) {
        SNode newWord = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x7bb20d258b5f79a5L, "org.iets3.req.core.structure.NonMergeableWord"));
        SPropertyOperations.set(newWord, MetaAdapterFactory.getProperty(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x7bb20d258b5f79a5L, 0x7bb20d258b60d4aeL, "escapedValue"), word);
        SNodeOperations.insertPrevSiblingChild(node, newWord);
      }
      SNodeOperations.deleteNode(node);
    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return SplitSentenceIntoWords_Intention.this;
    }
  }
}
