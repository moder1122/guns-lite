package cn.enilu.guns.bean.vo.offcialSite;

import lombok.Data;

@Data
public class BannerItem {
    private String url="javascript:";
    private String img;
    private String title="";

    public BannerItem(){

    }

    public BannerItem(String url, String img, String title) {
        this.url = url;
        this.img = img;
        this.title = title;
    }
}
