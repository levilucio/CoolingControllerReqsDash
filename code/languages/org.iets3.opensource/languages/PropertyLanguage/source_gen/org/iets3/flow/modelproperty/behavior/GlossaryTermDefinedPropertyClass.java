package org.iets3.flow.modelproperty.behavior;

/*Generated by MPS */

import jetbrains.mps.ide.modelchecker.platform.actions.SpecificChecker;
import java.util.List;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.ide.modelchecker.platform.actions.ModelCheckerIssue;
import org.jetbrains.mps.openapi.model.SModel;
import org.jetbrains.mps.openapi.util.ProgressMonitor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.ide.modelchecker.platform.actions.ModelChecker;

public class GlossaryTermDefinedPropertyClass extends SpecificChecker {

  @Override
  public List<SearchResult<ModelCheckerIssue>> checkModel(SModel model, ProgressMonitor progressContext) {

    final List<SearchResult<ModelCheckerIssue>> results = ListSequence.fromList(new ArrayList<SearchResult<ModelCheckerIssue>>());

    if (ListSequence.fromList(SModelOperations.roots(model, MetaAdapterFactory.getConcept(0x8e4e17debc104a34L, 0xa376a243fbde540eL, 0x68caade118d74a56L, "org.iets3.glossary.structure.GlossaryChunk"))).isNotEmpty()) {
      SNode glossaryChunk = ListSequence.fromList(SModelOperations.roots(model, MetaAdapterFactory.getConcept(0x8e4e17debc104a34L, 0xa376a243fbde540eL, 0x68caade118d74a56L, "org.iets3.glossary.structure.GlossaryChunk"))).first();
      if (!((ListSequence.fromList(SNodeOperations.getNodeDescendants(glossaryChunk, MetaAdapterFactory.getConcept(0x8e4e17debc104a34L, 0xa376a243fbde540eL, 0x68caade118d74a57L, "org.iets3.glossary.structure.GlossaryTerm"), false, new SAbstractConcept[]{})).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches("maxValueIncrease");
        }
      }) && ListSequence.fromList(SNodeOperations.getNodeDescendants(glossaryChunk, MetaAdapterFactory.getConcept(0x8e4e17debc104a34L, 0xa376a243fbde540eL, 0x68caade118d74a57L, "org.iets3.glossary.structure.GlossaryTerm"), false, new SAbstractConcept[]{})).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches("minValueIncrease");
        }
      }) && ListSequence.fromList(SNodeOperations.getNodeDescendants(glossaryChunk, MetaAdapterFactory.getConcept(0x8e4e17debc104a34L, 0xa376a243fbde540eL, 0x68caade118d74a57L, "org.iets3.glossary.structure.GlossaryTerm"), false, new SAbstractConcept[]{})).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches("minValueDecrease");
        }
      }) && (boolean) ListSequence.fromList(SNodeOperations.getNodeDescendants(glossaryChunk, MetaAdapterFactory.getConcept(0x8e4e17debc104a34L, 0xa376a243fbde540eL, 0x68caade118d74a57L, "org.iets3.glossary.structure.GlossaryTerm"), false, new SAbstractConcept[]{})).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).matches("maxValueDecrease");
        }
      }) == true))) {

        SpecificChecker.addIssue(results, ListSequence.fromList(SModelOperations.roots(model, MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x20fc30679cdcee4aL, "org.iets3.flow.dashboard.structure.DashboardHintDisplayer"))).first(), "Glossary terms not defined", ModelChecker.SEVERITY_ERROR, "FLOW language Custom Error", null);
      }
    } else {
      SpecificChecker.addIssue(results, ListSequence.fromList(SModelOperations.roots(model, MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x20fc30679cdcee4aL, "org.iets3.flow.dashboard.structure.DashboardHintDisplayer"))).first(), "Glossary model not defined", ModelChecker.SEVERITY_ERROR, "FLOW language Custom Error", null);
    }

    return results;
  }
}
