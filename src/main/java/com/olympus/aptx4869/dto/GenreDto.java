/*
* 全著作権を、株式会社GSIが所有します。
* 日本の法律では、著作権は創作の時点で自動的に発生しています。
*
* ソフトウェアは、株式会社GSIによって提供されます。
* ソフトウェアは現存するままの状態で、明示であるか暗黙であるかを問わず
* 何らの保証もなく提供されます。
* ここでいう保証とは、商品性、特定の目的への適合性、および権利非侵害に
* ついての保証も含みますが、それに限定されるものではありません。
* 著者または著作権者は、いかなる主張（このソフトウェアまたはその派生物を
* 使うか、修正するか、配布することの結果として被認可者が受ける損害賠償）
* に対しても責任を負わないものとします。
*/
package com.olympus.aptx4869.dto;

import java.time.LocalDateTime;

public class GenreDto {

    private Integer genreId;

    private String genreName;

    private boolean deleteFlag;

    private LocalDateTime registerDatetime;

    private LocalDateTime updateDatetime;

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public LocalDateTime getRegisterDatetime() {
        return registerDatetime;
    }

    public void setRegisterDatetime(LocalDateTime registerDatetime) {
        this.registerDatetime = registerDatetime;
    }

    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }



}
