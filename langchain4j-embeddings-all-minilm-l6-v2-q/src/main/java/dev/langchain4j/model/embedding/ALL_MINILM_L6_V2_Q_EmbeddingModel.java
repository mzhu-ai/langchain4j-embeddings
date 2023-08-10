package dev.langchain4j.model.embedding;

public class ALL_MINILM_L6_V2_Q_EmbeddingModel extends AbstractInProcessEmbeddingModel {

    private static final OnnxBertEmbeddingModel MODEL = loadFromJar("all-minilm-l6-v2-q.onnx");

    @Override
    protected OnnxBertEmbeddingModel model() {
        return MODEL;
    }
}