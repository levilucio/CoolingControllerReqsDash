package org.iets3.process.core.intentions;

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
import java.util.Collections;
import jetbrains.mps.intentions.IntentionExecutableBase;
import org.jetbrains.mps.openapi.language.SLanguage;
import jetbrains.mps.lang.smodel.behavior.LanguageIdentity__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.persistence.ModelRoot;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.SModelInternal;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import org.iets3.utility.behavior.LanguageUtility;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.SModelRepository;
import org.iets3.process.core.behavior.FlowChunk__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.HashMap;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.intentions.IntentionDescriptor;

public final class populateFlowModel_Intention extends IntentionDescriptorBase implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public populateFlowModel_Intention() {
    super(MetaAdapterFactory.getConcept(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x4312b5445d47f8f3L, "org.iets3.process.core.structure.FlowChunk"), IntentionType.NORMAL, true, new SNodePointer("r:b701b71e-94ab-49ee-a9fa-8423d6578c72(org.iets3.process.core.intentions)", "5308446763492465382"));
  }
  @Override
  public String getPresentation() {
    return "populateFlowModel";
  }
  @Override
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }
  @Override
  public boolean isSurroundWith() {
    return false;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new populateFlowModel_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends IntentionExecutableBase {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Populate Flow Model";
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {

      final String flowModelName = "FlowModel";

      boolean isDataModelFound = false;
      SLanguage languageNew = LanguageIdentity__BehaviorDescriptor.getLanguage_id34EJa6aIcyj.invoke(SLinkOperations.getTarget(SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x4312b5445d47f8f3L, 0x2ec4396c87920b79L, "targetDashboardLanguage")), MetaAdapterFactory.getContainmentLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x3e6a40ba27dd70f3L, 0x312abca18ab995e2L, "languageId")));
      SModule sourceModule = languageNew.getSourceModule();

      Iterable<ModelRoot> modelRoots = sourceModule.getModelRoots();
      for (ModelRoot root : Sequence.fromIterable(modelRoots)) {

        for (SModel item : Sequence.fromIterable(root.getModels())) {
          if (item.getModelName().equals(flowModelName)) {

            for (SNode rootNode : Sequence.fromIterable(item.getRootNodes())) {
              item.removeRootNode(rootNode);
              break;
            }
            isDataModelFound = true;
          }
        }

        if (!(isDataModelFound)) {

          System.out.println("Going to create!!!!!!");

          SModel createModel = root.createModel(flowModelName);

          for (SModel atom : Sequence.fromIterable(root.getModels())) {
            if (atom.getModelName().equals(flowModelName)) {

              SModelInternal sModelInternal = ((SModelInternal) atom);
              sModelInternal.addLanguage(MetaAdapterFactory.getLanguage(MetaIdFactory.langId(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L), "jetbrains.mps.lang.smodel"));
              sModelInternal.addLanguage(MetaAdapterFactory.getLanguage(MetaIdFactory.langId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L), "org.iets3.flow.property.formulae"));
              sModelInternal.addLanguage(MetaAdapterFactory.getLanguage(MetaIdFactory.langId(0xecea2a9218f4e3bL, 0xbadca524a5addb7cL), "org.iets3.flow.property"));
              sModelInternal.addLanguage(MetaAdapterFactory.getLanguage(MetaIdFactory.langId(0x102111329b5e427aL, 0x9b371c1f28794a5eL), "org.iets3.flow.dashboard"));

              SLanguage propertyLanguage = LanguageUtility.getLanguageFromAbstractConcept(ListSequence.fromList(SNodeOperations.getNodeDescendants(ListSequence.fromList(SLinkOperations.getChildren(node, MetaAdapterFactory.getContainmentLink(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x4312b5445d47f8f3L, 0x4312b5445d47f8f4L, "stateInstances"))).first(), MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x691240ff880dbb0aL, "org.iets3.process.modelproperty.formulae.structure.AtomicProperty"), false, new SAbstractConcept[]{})).where(new IWhereFilter<SNode>() {
                public boolean accept(SNode it) {
                  return (SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x24b2bf7ce180eb54L, 0x24b2bf7ce180eb55L, "conceptDeclaration")) != null);
                }
              }).select(new ISelector<SNode, SNode>() {
                public SNode select(SNode it) {
                  return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x24b2bf7ce180eb54L, 0x24b2bf7ce180eb55L, "conceptDeclaration"));
                }
              }).first());
              sModelInternal.addLanguage(propertyLanguage);

              sModelInternal.addModelImport(SModelRepository.getInstance().getModelDescriptor(propertyLanguage.getQualifiedName() + ".structure").getReference());
              FlowChunk__BehaviorDescriptor.fixModuleImports_id5MdYwHWTJdG.invoke(node, ListSequence.fromList(SNodeOperations.getNodeDescendants(ListSequence.fromList(SLinkOperations.getChildren(node, MetaAdapterFactory.getContainmentLink(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x4312b5445d47f8f3L, 0x4312b5445d47f8f4L, "stateInstances"))).first(), MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x691240ff880dbb0aL, "org.iets3.process.modelproperty.formulae.structure.AtomicProperty"), false, new SAbstractConcept[]{})).where(new IWhereFilter<SNode>() {
                public boolean accept(SNode it) {
                  return (SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x24b2bf7ce180eb54L, 0x24b2bf7ce180eb55L, "conceptDeclaration")) != null);
                }
              }).select(new ISelector<SNode, SNode>() {
                public SNode select(SNode it) {
                  return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x24b2bf7ce180eb54L, 0x24b2bf7ce180eb55L, "conceptDeclaration"));
                }
              }).first(), sourceModule);

            }
          }
        }

        System.out.println("Going to copy....................");

        // copying useful properties  
        SNode flow = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x3b5f775e0d415b00L, "org.iets3.process.dashboard.structure.FlowData"));
        SPropertyOperations.set(flow, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "FlowData");

        // keep track of which nodes from the flow definition are mapped into which nodes in the dashboard states 
        HashMap<SNode, SNode> stateMap = new HashMap<SNode, SNode>();

        SPropertyOperations.set(flow, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "FlowDataRootNode");

        // first create all the new states in the dashboard 

        for (SNode state : ListSequence.fromList(SLinkOperations.getChildren(node, MetaAdapterFactory.getContainmentLink(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x4312b5445d47f8f3L, 0x4312b5445d47f8f4L, "stateInstances")))) {
          SNode stateDashboard = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, "org.iets3.process.dashboard.structure.State"));
          stateMap.put(state, stateDashboard);
          SLinkOperations.setTarget(stateDashboard, MetaAdapterFactory.getContainmentLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x5337259791af7857L, "formula"), SNodeOperations.copyNode(SLinkOperations.getTarget(state, MetaAdapterFactory.getContainmentLink(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x4312b5445d47f8ebL, 0x4312b5445d48e926L, "propertyFormula"))));
          SPropertyOperations.set(stateDashboard, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), SPropertyOperations.getString(state, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
          SPropertyOperations.set(stateDashboard, MetaAdapterFactory.getProperty(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x5337259791af7855L, "text"), SPropertyOperations.getString(SLinkOperations.getTarget(state, MetaAdapterFactory.getContainmentLink(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x4312b5445d47f8ebL, 0x4312b5445d47f8eeL, "displayString")), MetaAdapterFactory.getProperty(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x4312b5445d47f76cL, 0x11262ed91ea56412L, "text")));
          SPropertyOperations.set(stateDashboard, MetaAdapterFactory.getProperty(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x73258383c7248195L, "isStart"), "" + (SPropertyOperations.getBoolean(state, MetaAdapterFactory.getProperty(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x4312b5445d47f8ebL, 0x73258383c723d92cL, "startState"))));
          if (ListSequence.fromList(SLinkOperations.getChildren(state, MetaAdapterFactory.getContainmentLink(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x4312b5445d47f8ebL, 0x73258383c7215c91L, "nextStates"))).isEmpty()) {
            SPropertyOperations.set(stateDashboard, MetaAdapterFactory.getProperty(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x73258383c79e9fc6L, "isFinal"), "" + (true));
          } else {
            SPropertyOperations.set(stateDashboard, MetaAdapterFactory.getProperty(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x73258383c79e9fc6L, "isFinal"), "" + (false));
          }
          if (ListSequence.fromList(SLinkOperations.getChildren(state, MetaAdapterFactory.getContainmentLink(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x4312b5445d47f8ebL, 0x11262ed91e9e6cf3L, "listOfNewNodes"))).isNotEmpty()) {
            for (SNode pointer : ListSequence.fromList(SLinkOperations.getChildren(state, MetaAdapterFactory.getContainmentLink(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x4312b5445d47f8ebL, 0x11262ed91e9e6cf3L, "listOfNewNodes")))) {
              SNode dashboardNodePointer = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791af7864L, "org.iets3.process.dashboard.structure.NodePointer"));
              SLinkOperations.setTarget(dashboardNodePointer, MetaAdapterFactory.getReferenceLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791af7864L, 0x5337259791af7865L, "pointer"), SLinkOperations.getTarget(pointer, MetaAdapterFactory.getReferenceLink(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x11262ed91e9e6cf8L, 0x11262ed91ea1252dL, "conceptToBeCreated")));
              SLinkOperations.getChildren(stateDashboard, MetaAdapterFactory.getContainmentLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x5337259791af7867L, "listOfPointer")).add(dashboardNodePointer);
              FlowChunk__BehaviorDescriptor.isAlreadyAdded_id18xeVvsJfYK.invoke(node, SLinkOperations.getTarget(dashboardNodePointer, MetaAdapterFactory.getReferenceLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791af7864L, 0x5337259791af7865L, "pointer")), (SModelInternal) SModelRepository.getInstance().getModelDescriptor(flowModelName));
              FlowChunk__BehaviorDescriptor.fixModuleImports_id5MdYwHWTJdG.invoke(node, SLinkOperations.getTarget(dashboardNodePointer, MetaAdapterFactory.getReferenceLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791af7864L, 0x5337259791af7865L, "pointer")), sourceModule);
            }
          }
          ListSequence.fromList(SLinkOperations.getChildren(flow, MetaAdapterFactory.getContainmentLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x3b5f775e0d415b00L, 0x5337259791af784dL, "stateList"))).addElement(stateDashboard);
        }


        // now reconnect the dashboard states accordingly 
        // add edges for previous states to avoid searching for the predecessor from the top of the tree 

        for (SNode state : ListSequence.fromList(SLinkOperations.getChildren(node, MetaAdapterFactory.getContainmentLink(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x4312b5445d47f8f3L, 0x4312b5445d47f8f4L, "stateInstances")))) {
          for (SNode oldStatePointer : ListSequence.fromList(SLinkOperations.getChildren(state, MetaAdapterFactory.getContainmentLink(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x4312b5445d47f8ebL, 0x73258383c7215c91L, "nextStates")))) {
            SNode nextPointer = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x73258383c7270020L, "org.iets3.process.dashboard.structure.StatePointer"));
            SLinkOperations.setTarget(nextPointer, MetaAdapterFactory.getReferenceLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x73258383c7270020L, 0x73258383c7270021L, "nextStatePointer"), stateMap.get(SLinkOperations.getTarget(oldStatePointer, MetaAdapterFactory.getReferenceLink(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x73258383c7215c8bL, 0x73258383c7215c8cL, "flowStatePointer"))));
            SLinkOperations.setTarget(nextPointer, MetaAdapterFactory.getReferenceLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x73258383c7270020L, 0xca878da6e6bd0e8L, "previousStatePointer"), stateMap.get(state));
            SNode previousPointer = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x73258383c7270020L, "org.iets3.process.dashboard.structure.StatePointer"));
            SLinkOperations.setTarget(previousPointer, MetaAdapterFactory.getReferenceLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x73258383c7270020L, 0x73258383c7270021L, "nextStatePointer"), stateMap.get(state));
            ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(stateMap.get(state), MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, "org.iets3.process.dashboard.structure.State")), MetaAdapterFactory.getContainmentLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x73258383c72e53c4L, "nextStates"))).addElement(nextPointer);
            ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(stateMap.get(SLinkOperations.getTarget(oldStatePointer, MetaAdapterFactory.getReferenceLink(0xe8ac6d1264b24478L, 0xbf9a80cbf4ec8c16L, 0x73258383c7215c8bL, 0x73258383c7215c8cL, "flowStatePointer"))), MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, "org.iets3.process.dashboard.structure.State")), MetaAdapterFactory.getContainmentLink(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, 0x73258383c77c638aL, "previousStates"))).addElement(previousPointer);
          }
        }

        SModel createdModel = SModelRepository.getInstance().getModelDescriptor("FlowModel");
        SModelOperations.addRootNode(createdModel, flow);
      }


      // running actual transsformation code generation! TODO 
    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return populateFlowModel_Intention.this;
    }
  }
}
