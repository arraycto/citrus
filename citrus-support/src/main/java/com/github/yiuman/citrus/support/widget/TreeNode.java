package com.github.yiuman.citrus.support.widget;

import com.github.yiuman.citrus.support.model.BaseTree;

/**
 * 树形控件
 *
 * @author yiuman
 * @date 2020/6/1
 */
public class TreeNode<M extends BaseTree<?, ?>> extends BaseWidget<M> {

    /**
     * 模型的显示名称
     */
    private String modelTextField;

    /**
     * 模型的主键
     */
    private String modelKeyField;

    public TreeNode() {
    }

    public TreeNode(String text, String key, M model) {
        super(text, key, model);
    }

    @Override
    public String getWidgetName() {
        return "FormSelectTree";
    }

    public String getModelTextField() {
        return modelTextField;
    }

    public void setModelTextField(String modelTextField) {
        this.modelTextField = modelTextField;
    }

    public String getModelKeyField() {
        return modelKeyField;
    }

    public void setModelKeyField(String modelKeyField) {
        this.modelKeyField = modelKeyField;
    }
}