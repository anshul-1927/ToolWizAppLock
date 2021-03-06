/*******************************************************************************
 * Copyright (c) 2015 btows.com.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package com.cleanwiz.applock.data;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table HideFile.
 */
public class HideFile {

    private Long id;
    private Integer beyondGroupId;
    private String name;
    private String oldPathUrl;
    private String newPathUrl;
    private Long moveDate;

    public HideFile() {
    }

    public HideFile(Long id) {
        this.id = id;
    }

    public HideFile(Long id, Integer beyondGroupId, String name, String oldPathUrl, String newPathUrl, Long moveDate) {
        this.id = id;
        this.beyondGroupId = beyondGroupId;
        this.name = name;
        this.oldPathUrl = oldPathUrl;
        this.newPathUrl = newPathUrl;
        this.moveDate = moveDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBeyondGroupId() {
        return beyondGroupId;
    }

    public void setBeyondGroupId(Integer beyondGroupId) {
        this.beyondGroupId = beyondGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOldPathUrl() {
        return oldPathUrl;
    }

    public void setOldPathUrl(String oldPathUrl) {
        this.oldPathUrl = oldPathUrl;
    }

    public String getNewPathUrl() {
        return newPathUrl;
    }

    public void setNewPathUrl(String newPathUrl) {
        this.newPathUrl = newPathUrl;
    }

    public Long getMoveDate() {
        return moveDate;
    }

    public void setMoveDate(Long moveDate) {
        this.moveDate = moveDate;
    }

}
