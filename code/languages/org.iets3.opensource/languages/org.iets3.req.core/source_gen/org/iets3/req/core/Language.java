package org.iets3.req.core;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import jetbrains.mps.smodel.adapter.ids.SLanguageId;
import java.util.UUID;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.smodel.runtime.ILanguageAspect;
import jetbrains.mps.openapi.actions.descriptor.ActionAspectDescriptor;
import org.iets3.req.core.actions.ActionAspectDescriptorImpl;
import jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor;
import jetbrains.mps.openapi.editor.descriptor.EditorAspectDescriptor;
import org.iets3.req.core.editor.EditorAspectDescriptorImpl;
import jetbrains.mps.intentions.IntentionAspectDescriptor;
import org.iets3.req.core.intentions.IntentionsDescriptor;
import jetbrains.mps.smodel.runtime.StructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptPresentationAspect;
import org.iets3.req.core.structure.ConceptPresentationAspectImpl;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import org.iets3.req.core.typesystem.TypesystemDescriptor;

public class Language extends LanguageRuntime {
  private static final Logger LOG = LogManager.getLogger(jetbrains.mps.smodel.Language.class);
  public static final String MODULE_REF = "a3c6f642-41b7-44cb-951b-463b8427a245(org.iets3.req.core)";
  public Language() {
  }
  @Override
  public String getNamespace() {
    return "org.iets3.req.core";
  }

  @Override
  public int getVersion() {
    return 0;
  }

  public SLanguageId getId() {
    return new SLanguageId(UUID.fromString("a3c6f642-41b7-44cb-951b-463b8427a245"));
  }
  @Override
  protected String[] getExtendedLanguageIDs() {
    return new String[]{"com.mbeddr.core.base", "com.mbeddr.doc"};
  }
  @Override
  public Collection<TemplateModule> getGenerators() {
    return TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "3224d768-1b3e-40d8-a848-1fc4d5e5e4db(org.iets3.req.core#5151426049053136026)"));
  }
  @Override
  protected <T extends ILanguageAspect> T createAspect(Class<T> aspectClass) {
    try {
      if (aspectClass.getName().equals("jetbrains.mps.openapi.actions.descriptor.ActionAspectDescriptor")) {
        if (aspectClass == ActionAspectDescriptor.class) {
          return (T) new ActionAspectDescriptorImpl();
        }
      }
      if (aspectClass.getName().equals("jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor")) {
        if (aspectClass == BehaviorAspectDescriptor.class) {
          return (T) new org.iets3.req.core.behavior.BehaviorAspectDescriptor();
        }
      }
      if (aspectClass.getName().equals("jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor")) {
        if (aspectClass == ConstraintsAspectDescriptor.class) {
          return (T) new org.iets3.req.core.constraints.ConstraintsAspectDescriptor();
        }
      }
      if (aspectClass.getName().equals("jetbrains.mps.openapi.editor.descriptor.EditorAspectDescriptor")) {
        if (aspectClass == EditorAspectDescriptor.class) {
          return (T) new EditorAspectDescriptorImpl();
        }
      }
      if (aspectClass.getName().equals("jetbrains.mps.intentions.IntentionAspectDescriptor")) {
        if (aspectClass == IntentionAspectDescriptor.class) {
          return (T) new IntentionsDescriptor();
        }
      }
      if (aspectClass.getName().equals("jetbrains.mps.smodel.runtime.StructureAspectDescriptor")) {
        if (aspectClass == StructureAspectDescriptor.class) {
          return (T) new org.iets3.req.core.structure.StructureAspectDescriptor();
        }
      }
      if (aspectClass.getName().equals("jetbrains.mps.smodel.runtime.ConceptPresentationAspect")) {
        if (aspectClass == ConceptPresentationAspect.class) {
          return (T) new ConceptPresentationAspectImpl();
        }
      }
      if (aspectClass.getName().equals("jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor")) {
        if (aspectClass == IHelginsDescriptor.class) {
          return (T) new TypesystemDescriptor();
        }
      }
      return null;
    } catch (Throwable t) {
      LOG.error("Exception on descriptor instantiation", t);
      return null;
    }
  }
}
