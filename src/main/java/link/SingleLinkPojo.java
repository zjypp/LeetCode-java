package link;

import lombok.Data;

/**
 * 单向链表
 * @author jason
 */
@Data
public class SingleLinkPojo {

    public SingleLinkPojo(Integer value){
        this.value =value;
    }
    private SingleLinkPojo next;
    private Integer value;
}
