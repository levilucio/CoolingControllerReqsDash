package org.iets3.req.core.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import jetbrains.mps.openapi.editor.descriptor.EditorHintsProvider;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorHint;
import java.util.Arrays;
import jetbrains.mps.editor.runtime.desctiptor.ConceptEditorHintImpl;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;
import jetbrains.mps.openapi.editor.descriptor.TransformationMenu;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import java.util.Map;
import java.util.HashMap;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase implements EditorHintsProvider {
  private Collection<ConceptEditorHint> myHints = Arrays.<ConceptEditorHint>asList(new ConceptEditorHintImpl("table", "Requirements Table", true, "org.iets3.req.core.editor.requirementsHints.table"), new ConceptEditorHintImpl("tableWithDetails", "Requirements Table", true, "org.iets3.req.core.editor.requirementsHints.tableWithDetails"));
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    {
      SAbstractConcept cncpt = ((SAbstractConcept) concept);
      Integer preIndex = indices_xbvbvu_a0b.get(cncpt);
      int switchIndex = (preIndex == null ? -1 : preIndex);
      switch (switchIndex) {
        case 0:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new CCTag_Editor());
          }
          break;
        case 1:
          if (true) {
            return Arrays.asList(new ConceptEditor[]{new DefaultRequirement_Editor(), new DefaultRequirement_presentationMode_Editor(), new DefaultRequirement_table_Editor(), new DefaultRequirement_table_tableWithDetails_Editor()});
          }
          break;
        case 2:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new HeaderRequirement_Editor());
          }
          break;
        case 3:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new Kind_Editor());
          }
          break;
        case 4:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new NonMergeableWord_Editor());
          }
          break;
        case 5:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new PlainReqRefWord_Editor());
          }
          break;
        case 6:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new PriorityTag_Editor());
          }
          break;
        case 7:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new RelTag_Editor());
          }
          break;
        case 8:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new RelationKind_Editor());
          }
          break;
        case 9:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new ReqRef_Editor());
          }
          break;
        case 10:
          if (true) {
            return Arrays.asList(new ConceptEditor[]{new ReqRelWord_Editor(), new ReqRelWord_presentationMode_Editor()});
          }
          break;
        case 11:
          if (true) {
            return Arrays.asList(new ConceptEditor[]{new RequirementsChunk_Editor(), new RequirementsChunk_table_Editor()});
          }
          break;
        case 12:
          if (true) {
            return Arrays.asList(new ConceptEditor[]{new RequirementsDocSection_Editor(), new RequirementsDocSection_presentationMode_Editor()});
          }
          break;
        case 13:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new State_Editor());
          }
          break;
        case 14:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new Tag_Editor());
          }
          break;
        default:
      }
    }
    return Collections.<ConceptEditor>emptyList();
  }

  @NotNull
  public Collection<ConceptEditorComponent> getDeclaredEditorComponents(SAbstractConcept concept, String editorComponentId) {
    {
      SAbstractConcept cncpt = ((SAbstractConcept) concept);
      Integer preIndex = indices_xbvbvu_a0d.get(cncpt);
      int switchIndex = (preIndex == null ? -1 : preIndex);
      switch (switchIndex) {
        case 0:
          if (true) {
            if ("org.iets3.req.core.editor.relation".equals(editorComponentId)) {
              return Collections.<ConceptEditorComponent>singletonList(new relation());
            }
          }
          break;
        default:
      }
    }
    return Collections.<ConceptEditorComponent>emptyList();
  }
  public Collection<ConceptEditorHint> getHints() {
    return myHints;
  }

  @NotNull
  @Override
  public Collection<TransformationMenu> getDeclaredDefaultTransformationMenus(SAbstractConcept concept) {
    {
      SAbstractConcept cncpt = concept;
      Integer preIndex = indices_xbvbvu_a0g.get(cncpt);
      int switchIndex = (preIndex == null ? -1 : preIndex);
      switch (switchIndex) {
        case 0:
          if (true) {
            return Collections.<TransformationMenu>singletonList(new template_GrammarCellsSideTransformationsMenu());
          }
          break;
        default:
      }
    }
    return Collections.<TransformationMenu>emptyList();
  }
  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    {
      SAbstractConcept cncpt = concept;
      Integer preIndex = indices_xbvbvu_a0h.get(cncpt);
      int switchIndex = (preIndex == null ? -1 : preIndex);
      switch (switchIndex) {
        case 0:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_AbstractRequirement());
          }
          break;
        case 1:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_CCTag());
          }
          break;
        case 2:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_DefaultRequirement());
          }
          break;
        case 3:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_HeaderRequirement());
          }
          break;
        case 4:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_IReqContainer());
          }
          break;
        case 5:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_IReqContent());
          }
          break;
        case 6:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_IReqDocContent());
          }
          break;
        case 7:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_IReqRefCtx());
          }
          break;
        case 8:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_IRequirementsRelation());
          }
          break;
        case 9:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_IconDummyAddChildReq());
          }
          break;
        case 10:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_IconDummyAddSiblingReq());
          }
          break;
        case 11:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_IconDummyDeleteReq());
          }
          break;
        case 12:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Kind());
          }
          break;
        case 13:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_KindFunctional());
          }
          break;
        case 14:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_KindNonFunctional());
          }
          break;
        case 15:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_NonMergeableWord());
          }
          break;
        case 16:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_PlainReqRefWord());
          }
          break;
        case 17:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_PriorityTag());
          }
          break;
        case 18:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_RelKindConflicts());
          }
          break;
        case 19:
          if (true) {
            return Arrays.asList(new SubstituteMenu[]{new GrammarCellsSubstituteMenu_RelTag(), new RelTag_SubstituteMenu()});
          }
          break;
        case 20:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_RelationKind());
          }
          break;
        case 21:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_ReqRef());
          }
          break;
        case 22:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_ReqRelWord());
          }
          break;
        case 23:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_RequirementsChunk());
          }
          break;
        case 24:
          if (true) {
            return Arrays.asList(new SubstituteMenu[]{new GrammarCellsSubstituteMenu_RequirementsDocSection(), new RequirementsDocSection_SubstituteMenu()});
          }
          break;
        case 25:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_State());
          }
          break;
        case 26:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_StateAccepted());
          }
          break;
        case 27:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_StateDone());
          }
          break;
        case 28:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_StateNew());
          }
          break;
        case 29:
          if (true) {
            return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Tag());
          }
          break;
        default:
      }
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static Map<SAbstractConcept, Integer> buildConceptIndices(SAbstractConcept... concepts) {
    HashMap<SAbstractConcept, Integer> res = new HashMap<SAbstractConcept, Integer>();
    int counter = 0;
    for (SAbstractConcept c : concepts) {
      res.put(c, counter++);
    }
    return res;
  }
  private static final Map<SAbstractConcept, Integer> indices_xbvbvu_a0b = buildConceptIndices(MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x75ac1dcdb58896b7L, "org.iets3.req.core.structure.CCTag"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc8195b9L, "org.iets3.req.core.structure.DefaultRequirement"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x3ab49e14c25e58e6L, "org.iets3.req.core.structure.HeaderRequirement"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc895b1dL, "org.iets3.req.core.structure.Kind"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x7bb20d258b5f79a5L, "org.iets3.req.core.structure.NonMergeableWord"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x7a4c2a11e62715a7L, "org.iets3.req.core.structure.PlainReqRefWord"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x7b990bd188cde19dL, "org.iets3.req.core.structure.PriorityTag"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e5d5fbL, "org.iets3.req.core.structure.RelTag"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e3a494L, "org.iets3.req.core.structure.RelationKind"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37818L, "org.iets3.req.core.structure.ReqRef"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e3a6a8L, "org.iets3.req.core.structure.ReqRelWord"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc81949cL, "org.iets3.req.core.structure.RequirementsChunk"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc883be3L, "org.iets3.req.core.structure.RequirementsDocSection"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5463f52ab0ddac7L, "org.iets3.req.core.structure.State"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc895b1cL, "org.iets3.req.core.structure.Tag"));
  private static final Map<SAbstractConcept, Integer> indices_xbvbvu_a0d = buildConceptIndices(MetaAdapterFactory.getInterfaceConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, "org.iets3.req.core.structure.IRequirementsRelation"));
  private static final Map<SAbstractConcept, Integer> indices_xbvbvu_a0g = buildConceptIndices(MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL, "jetbrains.mps.lang.core.structure.BaseConcept"));
  private static final Map<SAbstractConcept, Integer> indices_xbvbvu_a0h = buildConceptIndices(MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc8195aeL, "org.iets3.req.core.structure.AbstractRequirement"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x75ac1dcdb58896b7L, "org.iets3.req.core.structure.CCTag"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc8195b9L, "org.iets3.req.core.structure.DefaultRequirement"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x3ab49e14c25e58e6L, "org.iets3.req.core.structure.HeaderRequirement"), MetaAdapterFactory.getInterfaceConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc87c94fL, "org.iets3.req.core.structure.IReqContainer"), MetaAdapterFactory.getInterfaceConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc8195b5L, "org.iets3.req.core.structure.IReqContent"), MetaAdapterFactory.getInterfaceConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x7a4c2a11e6426d50L, "org.iets3.req.core.structure.IReqDocContent"), MetaAdapterFactory.getInterfaceConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x382d84c5e1a03f05L, "org.iets3.req.core.structure.IReqRefCtx"), MetaAdapterFactory.getInterfaceConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37815L, "org.iets3.req.core.structure.IRequirementsRelation"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x4a9d5259fc70a855L, "org.iets3.req.core.structure.IconDummyAddChildReq"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x4a9d5259fc70a85fL, "org.iets3.req.core.structure.IconDummyAddSiblingReq"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x4a9d5259fc70a869L, "org.iets3.req.core.structure.IconDummyDeleteReq"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc895b1dL, "org.iets3.req.core.structure.Kind"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc895d1dL, "org.iets3.req.core.structure.KindFunctional"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0xb54392f5f81ecf4L, "org.iets3.req.core.structure.KindNonFunctional"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x7bb20d258b5f79a5L, "org.iets3.req.core.structure.NonMergeableWord"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x7a4c2a11e62715a7L, "org.iets3.req.core.structure.PlainReqRefWord"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x7b990bd188cde19dL, "org.iets3.req.core.structure.PriorityTag"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e3a4bdL, "org.iets3.req.core.structure.RelKindConflicts"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e5d5fbL, "org.iets3.req.core.structure.RelTag"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e3a494L, "org.iets3.req.core.structure.RelationKind"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e37818L, "org.iets3.req.core.structure.ReqRef"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5fd70b0af6e3a6a8L, "org.iets3.req.core.structure.ReqRelWord"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc81949cL, "org.iets3.req.core.structure.RequirementsChunk"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc883be3L, "org.iets3.req.core.structure.RequirementsDocSection"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5463f52ab0ddac7L, "org.iets3.req.core.structure.State"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x7b990bd188d02e2cL, "org.iets3.req.core.structure.StateAccepted"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x7b990bd188d0c783L, "org.iets3.req.core.structure.StateDone"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x5463f52ab0ddacbL, "org.iets3.req.core.structure.StateNew"), MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc895b1cL, "org.iets3.req.core.structure.Tag"));
}
