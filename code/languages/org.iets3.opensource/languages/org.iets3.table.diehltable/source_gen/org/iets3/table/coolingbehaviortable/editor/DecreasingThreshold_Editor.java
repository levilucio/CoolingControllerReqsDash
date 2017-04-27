package org.iets3.table.coolingbehaviortable.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.editor.runtime.style.CellAlign;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.structure.editor.structure_StyleSheet;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;

public class DecreasingThreshold_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_lzq58e_a(editorContext, node);
  }
  private EditorCell createCollection_lzq58e_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_lzq58e_a");
    editorCell.setBig(true);
    Style style = new StyleImpl();
    style.set(StyleAttributes.HORIZONTAL_ALIGN, 0, CellAlign.RIGHT);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createCollection_lzq58e_a0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_lzq58e_b0(editorContext, node));
    return editorCell;
  }
  private EditorCell createCollection_lzq58e_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_lzq58e_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, 0, false);
    style.set(StyleAttributes.DRAW_BORDER, 0, true);
    style.set(StyleAttributes.HORIZONTAL_ALIGN, 0, CellAlign.RIGHT);
    style.set(StyleAttributes.BACKGROUND_COLOR, 0, StyleRegistry.getInstance().getSimpleColor(MPSColors.yellow));
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_lzq58e_a0a(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_lzq58e_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "Decreasing Threshold");
    editorCell.setCellId("Constant_lzq58e_a0a");
    Style style = new StyleImpl();
    structure_StyleSheet.apply_Keyword(style, editorCell);
    style.set(StyleAttributes.DRAW_BORDER, 0, true);
    style.set(StyleAttributes.SELECTABLE, 0, false);
    style.set(StyleAttributes.UNDERLINED, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_lzq58e_b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_lzq58e_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, 0, false);
    style.set(StyleAttributes.DRAW_BORDER, 0, true);
    style.set(StyleAttributes.HORIZONTAL_ALIGN, 0, CellAlign.RIGHT);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createConstant_lzq58e_a1a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_lzq58e_b1a(editorContext, node));
    editorCell.addEditorCell(this.createProperty_lzq58e_c1a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_lzq58e_d1a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_lzq58e_e1a(editorContext, node));
    editorCell.addEditorCell(this.createProperty_lzq58e_f1a(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_lzq58e_a1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "Min:");
    editorCell.setCellId("Constant_lzq58e_a1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, 0, false);
    style.set(StyleAttributes.DRAW_BORDER, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_lzq58e_b1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "<");
    editorCell.setCellId("Constant_lzq58e_b1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, 0, false);
    style.set(StyleAttributes.DRAW_BORDER, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_lzq58e_c1a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("Min");
    provider.setNoTargetText("<no Min>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_Min");
    Style style = new StyleImpl();
    style.set(StyleAttributes.DRAW_BORDER, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(editorContext);
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_lzq58e_d1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "Max:");
    editorCell.setCellId("Constant_lzq58e_d1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.DRAW_BORDER, 0, true);
    style.set(StyleAttributes.SELECTABLE, 0, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_lzq58e_e1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ">=");
    editorCell.setCellId("Constant_lzq58e_e1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.DRAW_BORDER, 0, true);
    style.set(StyleAttributes.SELECTABLE, 0, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_lzq58e_f1a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("Max");
    provider.setNoTargetText("<no Max>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_Max");
    Style style = new StyleImpl();
    style.set(StyleAttributes.DRAW_BORDER, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(editorContext);
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
}
