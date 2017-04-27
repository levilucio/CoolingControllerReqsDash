package org.iets3.glossary.behavior;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.selection.Selection;
import de.slisson.mps.richtext.runtime.selection.RichtextSelection;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import de.slisson.mps.richtext.behavior.IWord__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class TermRefHelper {
  public static boolean isCorrectSelection(EditorContext ctx) {
    Selection sel = ctx.getEditorComponent().getSelectionManager().getSelection();
    RichtextSelection rtsel = RichtextSelection.create(sel);
    return rtsel != null;
  }
  public static String getText(EditorContext ctx) {
    Selection sel = ctx.getEditorComponent().getSelectionManager().getSelection();
    RichtextSelection rtsel = RichtextSelection.create(sel);
    SNode w = ListSequence.fromList(rtsel.getSelectedWords()).first();
    return (String) IWord__BehaviorDescriptor.toTextString_id3Q5enzfMT4t.invoke(w);
  }
  public static SNode performReplace(EditorContext ctx, SNode term) {
    RichtextSelection selection = RichtextSelection.create(ctx.getEditorComponent().getSelectionManager().getSelection());
    SNode trw = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x8e4e17debc104a34L, 0xa376a243fbde540eL, 0x68caade118d8d73cL, "org.iets3.glossary.structure.TermRefWord"));
    SLinkOperations.setTarget(trw, MetaAdapterFactory.getReferenceLink(0x8e4e17debc104a34L, 0xa376a243fbde540eL, 0x68caade118d8d73cL, 0x68caade118d8d742L, "term"), term);
    selection.replaceSelected(trw);
    return trw;
  }
}
