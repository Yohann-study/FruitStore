package com.yohann.service.impl;

import com.yohann.dao.BaseDao;
import com.yohann.dao.MessageDao;
import com.yohann.entity.Message;
import com.yohann.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl extends BaseServiceImpl<Message> implements MessageService {
    @Autowired
    private MessageDao messageDao;

    @Override
    public BaseDao<Message> getBaseDao() {
        return messageDao;
    }
}
