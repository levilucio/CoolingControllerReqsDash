package org.iets3.glossary.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class AlternateText_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_53xwk2_a(editorContext, node);
  }
  private EditorCell createCollection_53xwk2_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_53xwk2_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_53xwk2_a0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_53xwk2_b0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_53xwk2_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "|");
    editorCell.setCellId("Constant_53xwk2_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, 0, true);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_53xwk2_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("text");
    provider.setNoTargetText("<no text>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_text");
    Style style = new StyleImpl();
    style.set(StyleAttributes.NAVIGATABLE_NODE, 0, AlternateText_Editor._StyleParameter_QueryFunction_53xwk2_a0b0(editorContext, node));
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(editorContext);
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private static SNode _StyleParameter_QueryFunction_53xwk2_a0b0(EditorContext editorContext, SNode node) {
    return SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(node), MetaAdapterFactory.getConcept(0x8e4e17debc104a34L, 0xa376a243fbde540eL, 0x68caade118d8d73cL, "org.iets3.glossary.structure.TermRefWord")), MetaAdapterFactory.getReferenceLink(0x8e4e17debc104a34L, 0xa376a243fbde540eL, 0x68caade118d8d73cL, 0x68caade118d8d742L, "term"));
  }
}
