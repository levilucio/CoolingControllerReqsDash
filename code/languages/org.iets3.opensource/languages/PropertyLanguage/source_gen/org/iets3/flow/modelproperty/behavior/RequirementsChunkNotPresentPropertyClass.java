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
import jetbrains.mps.ide.modelchecker.platform.actions.ModelChecker;

public class RequirementsChunkNotPresentPropertyClass extends SpecificChecker {

  @Override
  public List<SearchResult<ModelCheckerIssue>> checkModel(SModel model, ProgressMonitor progressContext) {

    final List<SearchResult<ModelCheckerIssue>> results = ListSequence.fromList(new ArrayList<SearchResult<ModelCheckerIssue>>());

    if (!(SModelOperations.roots(model, MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0x477d8ab2bc81949cL, "org.iets3.req.core.structure.RequirementsChunk")).isEmpty())) {

      SpecificChecker.addIssue(results, ListSequence.fromList(SModelOperations.roots(model, MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x20fc30679cdcee4aL, "org.iets3.flow.dashboard.structure.DashboardHintDisplayer"))).first(), "Add requirements chunk name", ModelChecker.SEVERITY_ERROR, "FLOW language Custom Error", null);
    }


    return results;

  }
}
