package org.iets3.glossary.actions;

/*Generated by MPS */

import jetbrains.mps.actions.descriptor.BaseActionAspectDescriptor;
import jetbrains.mps.openapi.actions.descriptor.ActionAspectDescriptor;
import java.util.Collection;
import jetbrains.mps.openapi.actions.descriptor.NodeFactory;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;

public class ActionAspectDescriptorImpl extends BaseActionAspectDescriptor implements ActionAspectDescriptor {

  @Override
  public Collection<NodeFactory> getFactories(SAbstractConcept concept) {
    return Collections.<NodeFactory>emptyList();
  }

  @Override
  public boolean hasBuilders() {
    return false;
  }
}
