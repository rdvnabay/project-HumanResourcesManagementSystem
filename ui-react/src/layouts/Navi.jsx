import React from 'react'
import { Menu } from "semantic-ui-react";

export default function Navi() {
    return (
        <Menu text>
        <Menu.Item header>KARİYER</Menu.Item>
        <Menu.Item name="Anasayfa" />
        <Menu.Item name="İş İlanları" />
        <Menu.Item name="Hakkımzda" />
        <Menu.Menu position="right">
          <Menu.Item>Giriş Yap</Menu.Item>
          <Menu.Item>Kayıt Ol</Menu.Item>
        </Menu.Menu>
      </Menu>
    )
}
