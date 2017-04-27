package org.iets3.flow.property.formulae.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.smodel.SNodePointer;

public class AtomicProperty_Constraints extends BaseConstraintsDescriptor {
  public AtomicProperty_Constraints() {
    super(MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x691240ff880dbb0aL, "org.iets3.flow.property.formulae.structure.AtomicProperty"));
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(MetaAdapterFactory.getReferenceLink(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x24b2bf7ce180eb54L, 0x24b2bf7ce180eb55L, "conceptDeclaration"), new BaseReferenceConstraintsDescriptor(MetaIdFactory.refId(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x24b2bf7ce180eb54L, 0x24b2bf7ce180eb55L), this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_pomk0b_a0a0a0a0a1a0b0a1a2;
          }
          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {

            return null;
          }
        };
      }
    });
    return references;
  }
  private static SNodePointer breakingNode_pomk0b_a0a0a0a0a1a0b0a1a2 = new SNodePointer("r:a1cf1431-2a94-41f4-be89-34ddc49db26f(org.iets3.flow.property.formulae.constraints)", "5696857644855403967");
}
