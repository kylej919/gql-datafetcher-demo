package org.kylej.gqldatafetcher.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;
import java.lang.Override;
import java.lang.String;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@org.kylej.gqldatafetcher.generated.Generated
public class CommentFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CommentFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Comment"));
  }

  public CommentFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CommentFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CommentFragmentProjection<PARENT, ROOT> text() {
    getFields().put("text", null);
    return this;
  }

  public CommentFragmentProjection<PARENT, ROOT> postId() {
    getFields().put("postId", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Comment {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
