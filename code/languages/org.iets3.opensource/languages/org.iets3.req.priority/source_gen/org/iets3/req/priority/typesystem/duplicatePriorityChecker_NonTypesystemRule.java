package org.iets3.req.priority.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class duplicatePriorityChecker_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public duplicatePriorityChecker_NonTypesystemRule() {
  }
  public void applyRule(final SNode priority, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    String name = SPropertyOperations.getString(priority, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
    SNode node = SNodeOperations.cast(SNodeOperations.getParent(priority), MetaAdapterFactory.getConcept(0x7a870bb787b6411eL, 0x92c2eb3e9e856127L, 0x690245617af9800L, "org.iets3.req.priority.structure.RootPriority"));
    List<SNode> priorityList = SLinkOperations.getChildren(node, MetaAdapterFactory.getContainmentLink(0x7a870bb787b6411eL, 0x92c2eb3e9e856127L, 0x690245617af9800L, 0x690245617af9803L, "priorityList"));
    int index = 0;
    for (SNode term : ListSequence.fromList(priorityList)) {

      if (index == SNodeOperations.getIndexInParent(priority)) {
        break;
      }

      if (SPropertyOperations.getString(term, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) == name) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(priority, "The Priority Term already exists !", "r:3274f76b-d96d-4a99-8cb6-6a14080b1f74(org.iets3.req.priority.typesystem)", "472917913057572165", null, errorTarget);
        }
      }
      index++;
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x7a870bb787b6411eL, 0x92c2eb3e9e856127L, 0x690245617af9805L, "org.iets3.req.priority.structure.Priority");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
