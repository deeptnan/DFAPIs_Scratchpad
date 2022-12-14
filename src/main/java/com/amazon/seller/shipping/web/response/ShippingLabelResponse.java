package com.amazon.seller.shipping.web.response;

import com.amazon.seller.shipping.model.SellingParty;
import com.amazon.seller.shipping.model.ShipFromParty;
import com.amazon.seller.shipping.model.ShippingLabelData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShippingLabelResponse {
    private ArrayList<ShippingLabelData> labelData;
    private SellingParty sellingParty;
    private String labelFormat;
    private String purchaseOrderNumber;
    public ShipFromParty shipFromParty;
}
