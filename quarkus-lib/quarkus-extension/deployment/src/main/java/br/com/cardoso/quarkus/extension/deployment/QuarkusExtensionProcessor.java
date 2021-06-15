package br.com.cardoso.quarkus.extension.deployment;

import br.com.cardoso.impl.ConvertMessage;
import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.arc.processor.DotNames;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class QuarkusExtensionProcessor {

    private static final String FEATURE = "quarkus-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    void declareConvertMessageAsBean(BuildProducer<AdditionalBeanBuildItem> additionalBeanProducer,
                                     BuildProducer<FeatureBuildItem> featureProducer) {

        featureProducer.produce(new FeatureBuildItem("convertMessage"));
        AdditionalBeanBuildItem build = new AdditionalBeanBuildItem.Builder()
                .addBeanClasses(ConvertMessage.class)
                .setUnremovable()
                .setDefaultScope(DotNames.APPLICATION_SCOPED)
                .build();
        additionalBeanProducer.produce(build);
    }
}
