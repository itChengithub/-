package com.changgou.search.pojo;

import com.alibaba.fastjson.JSON;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;
import java.util.Map;

@Document(indexName = "skuinfo",type = "docs")
public class SkuInfo {
    @Id
    private Long id;
    //sku名称
    /**
     * type=FieldType.Text:类型，Text是支持分词
     *      FieldType.Keyword：不分词
     * index=true：是否使用分词器。默认为true
     * analyzer="ik_smart" 创建索引时使用的分词器
     * searchAnalyzer=”ik.smart“ 搜索时使用的分词器
     */
    @Field(type = FieldType.Text,analyzer = "ik_smart",searchAnalyzer = "ik_smart")
    private String name;
    //商品价格，单位人名币
    @Field(type = FieldType.Double)
    private Long price;
    //库存数量
    private Integer num;
    //商品图片
    private String image;
    //商品状态：1-正常  2-下架  3-删除
    private String status;
    //创建时间
    private Date createTime;
    //商品更新时间
    private Date updateTime;
    //是否默认
    private String isDefault;
    //Spu的id
    private Long spuId;
    //品牌名称
    //FieldType.Keyword：不分词
    @Field(type = FieldType.Keyword)
    private String brandName;
    //所属类目id（三级分类）
    @Field(type = FieldType.Keyword)
    private String categoryName;
    //商品规格
    private String spec;
    //规格参数
    private Map<String,String> specMap;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public Map<String, String> getSpecMap() {
        return specMap;
    }

    public void setSpecMap(Map<String, String> specMap) {
        this.specMap = specMap;
    }



}
