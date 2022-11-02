package com.wei.system.strategy;


import com.wei.common.enums.ProcCategory;


/**
 * @Author: yuwei
 */
public class ProcContext {
    public static ProcStrategy build(String category) {
        return build(ProcCategory.getByCode(category));
    }
    public static ProcStrategy build(ProcCategory pc) {
        if (pc == null) {
            return null;
        }
        if (pc == ProcCategory.ORDER) {
            return new OrderProcStrategy();
        } else if (pc == ProcCategory.CONTRACT) {
            return new ContractProcStrategy();
        } else if (pc == ProcCategory.IMPL) {
            return new ImplProcStrategy();
        } else {
            return null;
        }
    }
}
