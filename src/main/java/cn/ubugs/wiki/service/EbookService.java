package cn.ubugs.wiki.service;

import cn.ubugs.wiki.domain.Ebook;
import cn.ubugs.wiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list() {
        return ebookMapper.selectByExample(null);
    }
}
