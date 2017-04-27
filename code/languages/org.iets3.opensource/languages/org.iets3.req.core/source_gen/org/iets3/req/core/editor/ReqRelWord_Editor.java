package org.iets3.req.core.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import com.mbeddr.mpsutil.grammarcells.runtime.CellActionWithReadAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.editor.runtime.selection.SelectionUtil;
import jetbrains.mps.openapi.editor.selection.SelectionManager;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.OldNewCompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.editor.runtime.style.FocusPolicy;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;

public class ReqRelWord_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_f682kz_a(editorContext, node);
  }
  private EditorCell createCollection_f682kz_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_f682kz_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createCustomFactory_f682kz_a0(editorContext, node));
    editorCell.addEditorCell(this.createCustomFactory_f682kz_b0(editorContext, node));
    editorCell.addEditorCell(this.createCustomFactory_f682kz_c0(editorContext, node));
    editorCell.addEditorCell(this.createCustomFactory_f682kz_d0(editorContext, node));
    return editorCell;
  }
  private EditorCell createCustomFactory_f682kz_a0(final EditorContext editorContext, final SNode node) {


    final EditorCell cell = createConstant_f682kz_a0a(editorContext, node);
    EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
      public EditorCell invoke() {
        cell.setAction(CellActionType.DELETE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {

            SNode unwrapped = SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind")));
            boolean caretLeft = true;
            if (caretLeft) {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.FIRST_CELL, 0);
            } else {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.LAST_CELL, -1);
            }
          }
          @Override
          public boolean canExecute_inReadAction(EditorContext editorContext) {
            SNode replacement = SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind"));
            SContainmentLink containmentLink = node.getContainmentLink();
            if (containmentLink == null) {
              return true;
            }
            SAbstractConcept expectedConcept = containmentLink.getTargetConcept();
            return expectedConcept == null || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(replacement)), SNodeOperations.asSConcept(expectedConcept));
          }
        });
        cell.setAction(CellActionType.BACKSPACE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {

            SNode unwrapped = SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind")));
            boolean caretLeft = true;
            if (caretLeft) {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.FIRST_CELL, 0);
            } else {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.LAST_CELL, -1);
            }
          }
          @Override
          public boolean canExecute_inReadAction(EditorContext editorContext) {
            SNode replacement = SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind"));
            SContainmentLink containmentLink = node.getContainmentLink();
            if (containmentLink == null) {
              return true;
            }
            SAbstractConcept expectedConcept = containmentLink.getTargetConcept();
            return expectedConcept == null || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(replacement)), SNodeOperations.asSConcept(expectedConcept));
          }
        });
        return cell;
      }
    }.invoke();
    return editorCell;
  }
  private EditorCell createConstant_f682kz_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "@rel");
    editorCell.setCellId("Constant_f682kz_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCustomFactory_f682kz_b0(final EditorContext editorContext, final SNode node) {


    final EditorCell cell = createConstant_f682kz_a1a(editorContext, node);
    EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
      public EditorCell invoke() {
        cell.setAction(CellActionType.DELETE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {

            SNode unwrapped = SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind")));
            boolean caretLeft = true;
            if (caretLeft) {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.FIRST_CELL, 0);
            } else {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.LAST_CELL, -1);
            }
          }
          @Override
          public boolean canExecute_inReadAction(EditorContext editorContext) {
            SNode replacement = SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind"));
            SContainmentLink containmentLink = node.getContainmentLink();
            if (containmentLink == null) {
              return true;
            }
            SAbstractConcept expectedConcept = containmentLink.getTargetConcept();
            return expectedConcept == null || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(replacement)), SNodeOperations.asSConcept(expectedConcept));
          }
        });
        cell.setAction(CellActionType.BACKSPACE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {

            SNode unwrapped = SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind")));
            boolean caretLeft = true;
            if (caretLeft) {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.FIRST_CELL, 0);
            } else {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.LAST_CELL, -1);
            }
          }
          @Override
          public boolean canExecute_inReadAction(EditorContext editorContext) {
            SNode replacement = SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind"));
            SContainmentLink containmentLink = node.getContainmentLink();
            if (containmentLink == null) {
              return true;
            }
            SAbstractConcept expectedConcept = containmentLink.getTargetConcept();
            return expectedConcept == null || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(replacement)), SNodeOperations.asSConcept(expectedConcept));
          }
        });
        return cell;
      }
    }.invoke();
    return editorCell;
  }
  private EditorCell createConstant_f682kz_a1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "(");
    editorCell.setCellId("Constant_f682kz_a1a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, 0, true);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCustomFactory_f682kz_c0(final EditorContext editorContext, final SNode node) {


    final EditorCell cell = createCollection_f682kz_a2a(editorContext, node);
    EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
      public EditorCell invoke() {
        return cell;
      }
    }.invoke();
    return editorCell;
  }
  private EditorCell createCollection_f682kz_a2a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_f682kz_a2a");
    editorCell.addEditorCell(this.createRefNode_f682kz_a0c0(editorContext, node));
    editorCell.addEditorCell(this.createCustomFactory_f682kz_b0c0(editorContext, node));
    return editorCell;
  }
  private EditorCell createRefNode_f682kz_a0c0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new ReqRelWord_Editor.kindSingleRoleHandler_f682kz_a0c0(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind"), editorContext);
    return provider.createCell();
  }
  private class kindSingleRoleHandler_f682kz_a0c0 extends SingleRoleCellProvider {
    public kindSingleRoleHandler_f682kz_a0c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      myEditorContext.getCellFactory().pushCellContext();
      myEditorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromNode(child));
      try {
        EditorCell editorCell = super.createChildCell(child);
        editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(myOwnerNode, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind"), child));
        editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(myOwnerNode, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind"), child));
        installCellInfo(child, editorCell);
        return editorCell;
      } finally {
        myEditorContext.getCellFactory().popCellContext();
      }
    }

    protected boolean isCompatibilityMode() {
      return false;
    }

    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("kind");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      myEditorContext.getCellFactory().pushCellContext();
      myEditorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(myOwnerNode, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_kind");
        installCellInfo(null, editorCell);
        return editorCell;
      } finally {
        myEditorContext.getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no kind>";
    }
  }
  private EditorCell createCustomFactory_f682kz_b0c0(final EditorContext editorContext, final SNode node) {


    final EditorCell cell = createRefNodeList_f682kz_a1a2a(editorContext, node);
    EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
      public EditorCell invoke() {
        cell.setAction(CellActionType.DELETE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {

            SNode unwrapped = SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind")));
            boolean caretLeft = false;
            if (caretLeft) {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.FIRST_CELL, 0);
            } else {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.LAST_CELL, -1);
            }
          }
          @Override
          public boolean canExecute_inReadAction(EditorContext editorContext) {
            SNode replacement = SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind"));
            SContainmentLink containmentLink = node.getContainmentLink();
            if (containmentLink == null) {
              return true;
            }
            SAbstractConcept expectedConcept = containmentLink.getTargetConcept();
            return expectedConcept == null || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(replacement)), SNodeOperations.asSConcept(expectedConcept));
          }
        });
        cell.setAction(CellActionType.BACKSPACE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {

            SNode unwrapped = SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind")));
            boolean caretLeft = false;
            if (caretLeft) {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.FIRST_CELL, 0);
            } else {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.LAST_CELL, -1);
            }
          }
          @Override
          public boolean canExecute_inReadAction(EditorContext editorContext) {
            SNode replacement = SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind"));
            SContainmentLink containmentLink = node.getContainmentLink();
            if (containmentLink == null) {
              return true;
            }
            SAbstractConcept expectedConcept = containmentLink.getTargetConcept();
            return expectedConcept == null || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(replacement)), SNodeOperations.asSConcept(expectedConcept));
          }
        });
        return cell;
      }
    }.invoke();
    return editorCell;
  }
  private EditorCell createRefNodeList_f682kz_a1a2a(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new ReqRelWord_Editor.targetsListHandler_f682kz_a1a2a(node, "targets", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Horizontal(), false);
    editorCell.setCellId("refNodeList_targets");
    if (true) {
      editorCell.getStyle().set(StyleAttributes.FOCUS_POLICY, FocusPolicy.FIRST_EDITABLE_CELL);
    }
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class targetsListHandler_f682kz_a1a2a extends RefNodeListHandler {
    public targetsListHandler_f682kz_a1a2a(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }
    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
    }
    public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
      editorContext.getCellFactory().pushCellContext();
      editorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromNode(elementNode));
      try {
        EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
        this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
        return elementCell;
      } finally {
        editorContext.getCellFactory().popCellContext();
      }
    }
    protected boolean isCompatibilityMode() {
      return false;
    }
    public EditorCell createEmptyCell(EditorContext editorContext) {
      editorContext.getCellFactory().pushCellContext();
      editorContext.getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(targetsListHandler_f682kz_a1a2a.this.getOwner(), MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e38904L, "targets")));
      try {
        EditorCell emptyCell = null;
        emptyCell = this.createEmptyCell_internal(editorContext, this.getOwner());
        this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
        return emptyCell;
      } finally {
        editorContext.getCellFactory().popCellContext();
      }
    }
    public EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createCustomFactory_f682kz_a0b0c0(editorContext, node);
    }
    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        if (elementNode != null) {
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.FORWARD));
          elementCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.BACKWARD));
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, ","));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
          elementCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(elementCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e38904L, "targets"), elementNode), new DefaultChildSubstituteInfo(myOwnerNode, elementNode, super.getLinkDeclaration(), myEditorContext)));
        }
      }
    }
    @Override
    public EditorCell createSeparatorCell(EditorContext editorContext, SNode prevNode, SNode nextNode) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, this.getOwner(), ",");
      editorCell.setSelectable(false);
      Style style = new StyleImpl();
      style.set(StyleAttributes.LAYOUT_CONSTRAINT, "");
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      editorCell.getStyle().putAll(style);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(prevNode, CellAction_DeleteNode.DeleteDirection.FORWARD));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(prevNode, CellAction_DeleteNode.DeleteDirection.BACKWARD));
      return editorCell;
    }
    private EditorCell createCustomFactory_f682kz_a0b0c0(final EditorContext editorContext, final SNode node) {


      final EditorCell cell = createConstant_f682kz_a0a1a2a(editorContext, node);
      EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
        public EditorCell invoke() {
          cell.setAction(CellActionType.DELETE, new CellActionWithReadAccess() {
            public void execute(EditorContext editorContext) {

              SNode unwrapped = SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind")));
              boolean caretLeft = false;
              if (caretLeft) {
                SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.FIRST_CELL, 0);
              } else {
                SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.LAST_CELL, -1);
              }
            }
            @Override
            public boolean canExecute_inReadAction(EditorContext editorContext) {
              SNode replacement = SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind"));
              SContainmentLink containmentLink = node.getContainmentLink();
              if (containmentLink == null) {
                return true;
              }
              SAbstractConcept expectedConcept = containmentLink.getTargetConcept();
              return expectedConcept == null || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(replacement)), SNodeOperations.asSConcept(expectedConcept));
            }
          });
          cell.setAction(CellActionType.BACKSPACE, new CellActionWithReadAccess() {
            public void execute(EditorContext editorContext) {

              SNode unwrapped = SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind")));
              boolean caretLeft = false;
              if (caretLeft) {
                SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.FIRST_CELL, 0);
              } else {
                SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.LAST_CELL, -1);
              }
            }
            @Override
            public boolean canExecute_inReadAction(EditorContext editorContext) {
              SNode replacement = SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind"));
              SContainmentLink containmentLink = node.getContainmentLink();
              if (containmentLink == null) {
                return true;
              }
              SAbstractConcept expectedConcept = containmentLink.getTargetConcept();
              return expectedConcept == null || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(replacement)), SNodeOperations.asSConcept(expectedConcept));
            }
          });
          return cell;
        }
      }.invoke();
      return editorCell;
    }
    private EditorCell createConstant_f682kz_a0a1a2a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
      editorCell.setCellId("Constant_f682kz_a0a1a2a");
      Style style = new StyleImpl();
      style.set(StyleAttributes.EDITABLE, 0, true);
      editorCell.getStyle().putAll(style);
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createCustomFactory_f682kz_d0(final EditorContext editorContext, final SNode node) {


    final EditorCell cell = createConstant_f682kz_a3a(editorContext, node);
    EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
      public EditorCell invoke() {
        cell.setAction(CellActionType.DELETE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {

            SNode unwrapped = SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind")));
            boolean caretLeft = false;
            if (caretLeft) {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.FIRST_CELL, 0);
            } else {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.LAST_CELL, -1);
            }
          }
          @Override
          public boolean canExecute_inReadAction(EditorContext editorContext) {
            SNode replacement = SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind"));
            SContainmentLink containmentLink = node.getContainmentLink();
            if (containmentLink == null) {
              return true;
            }
            SAbstractConcept expectedConcept = containmentLink.getTargetConcept();
            return expectedConcept == null || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(replacement)), SNodeOperations.asSConcept(expectedConcept));
          }
        });
        cell.setAction(CellActionType.BACKSPACE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {

            SNode unwrapped = SNodeOperations.replaceWithAnother(node, SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind")));
            boolean caretLeft = false;
            if (caretLeft) {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.FIRST_CELL, 0);
            } else {
              SelectionUtil.selectLabelCellAnSetCaret(editorContext, unwrapped, SelectionManager.LAST_CELL, -1);
            }
          }
          @Override
          public boolean canExecute_inReadAction(EditorContext editorContext) {
            SNode replacement = SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, 0x5fd70b0af6e3a4beL, "kind"));
            SContainmentLink containmentLink = node.getContainmentLink();
            if (containmentLink == null) {
              return true;
            }
            SAbstractConcept expectedConcept = containmentLink.getTargetConcept();
            return expectedConcept == null || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(SNodeOperations.getConcept(replacement)), SNodeOperations.asSConcept(expectedConcept));
          }
        });
        return cell;
      }
    }.invoke();
    return editorCell;
  }
  private EditorCell createConstant_f682kz_a3a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")");
    editorCell.setCellId("Constant_f682kz_a3a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
