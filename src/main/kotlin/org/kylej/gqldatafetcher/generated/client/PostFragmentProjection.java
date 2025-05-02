package org.kylej.gqldatafetcher.generated.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import jakarta.annotation.Generated;
import java.lang.Override;
import java.lang.String;

@Generated("com.netflix.graphql.dgs.codegen.CodeGen")
@org.kylej.gqldatafetcher.generated.Generated
public class PostFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public PostFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Post"));
  }

  public PostFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PostFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PostFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public PostFragmentProjection<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Post {");
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
