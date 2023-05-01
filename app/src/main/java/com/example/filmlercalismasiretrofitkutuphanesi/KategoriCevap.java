
package com.example.filmlercalismasiretrofitkutuphanesi;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KategoriCevap {

    @SerializedName("kategoriler")
    @Expose
    private List<Kategoriler> kategoriler;
    @SerializedName("success")
    @Expose
    private Integer success;

    public List<Kategoriler> getKategoriler() {
        return kategoriler;
    }

    public void setKategoriler(List<Kategoriler> kategoriler) {
        this.kategoriler = kategoriler;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

}
