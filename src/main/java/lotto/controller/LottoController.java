package lotto.controller;

import lotto.dto.request.LottoAmountRequest;
import lotto.dto.response.LottoesResponse;
import lotto.service.LottoService;
import lotto.util.Container;

public class LottoController {

    private final LottoService lottoService;

    public LottoController() {
        this.lottoService = Container.getInstance(LottoService.class);
    }

    public LottoesResponse makeLottoes(LottoAmountRequest request) {
        return lottoService.makeLottoes(request);
    }
}