package com.evaluation.bin.range.services;

import com.evaluation.bin.range.models.BinRangeInfo;

import java.util.Optional;
import java.util.UUID;

public interface BinRangeService {

    Optional<BinRangeInfo> findBinRangeInfoByPan(String pan);
    
    Optional<BinRangeInfo> findBinRangeInfoCacheByRef(UUID ref);
}
